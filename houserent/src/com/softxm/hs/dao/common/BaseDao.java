package com.softxm.hs.dao.common;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.softxm.hs.model.PageModel;

public class BaseDao {
	@Autowired
	protected HibernateTemplate hibernateTemplate;
	@Autowired
	protected JdbcTemplate jdbcTemplate;

	public void saveObject(Object entity) {
		hibernateTemplate.save(entity);
	}

	public Serializable saveObjectReturnId(Object entity) {
		return hibernateTemplate.save(entity);
	}

	public Object queryOneObject(String hql, Object... objects1) {
		List objects = hibernateTemplate.find(hql, objects1);
		if (objects.size() == 0) {
			return null;
		} else {
			return objects.get(0);
		}
	}
	
	protected int update(String sql, List params) {
		return jdbcTemplate.update(sql, params.toArray());
	}
	
	public List queryObjects(String hql, Object... objects1) {
		List objects = hibernateTemplate.find(hql, objects1);
		return objects;
	}

	public List queryObjectsEhCache(final String hql,final Object... objects1) {
		List list1= (List) this.hibernateTemplate.execute(new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query= session.createQuery(hql);
				//开启缓存
			    query.setCacheable(true);  
				for(int i=0;i<objects1.length;i++)
				{
					query.setParameter(i, objects1[i]);
				}
				List list = query.list();
				System.out.println(list.size());
				return list;
			}
		});
		 return list1;
	}
	
	public PageModel queryPageModel(final int currentPage, final int pageSize,
			final StringBuilder queryHql, final StringBuilder countHql,
			final StringBuilder whereHql, final String orderHql,
			final List paramList) {
		PageModel model = this.hibernateTemplate
				.execute(new HibernateCallback<PageModel>() {
					@Override
					public PageModel doInHibernate(Session session)
							throws HibernateException, SQLException {
						countHql.append(whereHql);
						Query query = session.createQuery(countHql.toString());
						if (paramList.size() > 0) {
							for (int i = 0; i < paramList.size(); i++) {
								query.setParameter(i, paramList.get(i));
							}
						}
						Long allCount = (Long) query.uniqueResult();
						queryHql.append(whereHql).append(orderHql);
						query = session.createQuery(queryHql.toString());
						if (paramList.size() > 0) {
							for (int i = 0; i < paramList.size(); i++) {
								query.setParameter(i, paramList.get(i));
							}
						}
						query.setFirstResult((currentPage - 1) * pageSize);
						query.setMaxResults(pageSize);
						List result = query.list();
						PageModel model = new PageModel();
						model.setCurrentPage(currentPage);
						model.setPageSize(pageSize);
						model.setResult(result);
						model.setAllCount(allCount);
						return model;
					}
				});
		return model;
	}
	
	public void updateAll(Object entity) {
		hibernateTemplate.update(entity);

	}

	public void updateSome(final String hql,final Object... obj) {
		this.hibernateTemplate.execute(new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query= session.createQuery(hql);
				for(int i=0;i<obj.length;i++)
				{
					query.setParameter(i, obj[i]);
				}
				query.executeUpdate();
				return null;
			}
		});
	}

	public void noRealDelete(final String hql) {
		this.hibernateTemplate.execute(new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				session.createQuery(hql).executeUpdate();
				return null;
			}
		});
	}

	public void deleteObejct(final String hql, final Object... obj) {
		this.hibernateTemplate.execute(new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {

				Query query = session.createQuery(hql);
				if (obj.length > 0) {
					for (int i = 0; i < obj.length; i++) {
						query.setParameter(i, obj[i]);
					}
				}
				query.executeUpdate();
				return null;
			}
		});
	};
	
	public void useSqlUpdate(final String sql,final Object... obj)
	{
		this.hibernateTemplate.execute(new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				SQLQuery query = session.createSQLQuery(sql);
				if (obj.length > 0) {
					for (int i = 0; i < obj.length; i++) {
						query.setParameter(i, obj[i]);
					}
				}
				query.executeUpdate();
				return null;
			}
		});
	}
	public Object useSqlQuery(final String sql,final Object... obj)
	{
		return this.hibernateTemplate.execute(new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				SQLQuery query = session.createSQLQuery(sql);
				if (obj.length > 0) {
					for (int i = 0; i < obj.length; i++) {
						query.setParameter(i, obj[i]);
					}
				}
				return query.uniqueResult();
			}
		});
	}
	
	/**
	 * 查询分页模型对象
	 * 
	 * @param javaBeanType
	 *            分页列表显示的集合中存放的Javabean类型
	 * @param currentPage
	 *            当前页
	 * @param pageSize
	 *            每页显示条数
	 * @param querySql
	 *            不带查询条件的查询语句
	 * @param countSql
	 *            不带查询条件的计算总记录数语句
	 * @param whereSql
	 *            查询条件语句
	 * @param orderSql
	 *            排序语句
	 * @param paramList
	 *            查询条件语句中的"?"对应的数据
	 * @return 完整的分页模型对象
	 */
	protected PageModel queryForPageModel(Class javaBeanType, int currentPage,
			int pageSize, StringBuilder querySql, StringBuilder countSql,
			StringBuilder whereSql, StringBuilder orderSql, List paramList) {
		// 拼凑完整的计算总记录数的SQL语句
		countSql.append(whereSql);
		// 计算总记录数
		int allCount = queryForInt(countSql.toString(), paramList);
		// 拼凑完整的查询SQL
		querySql.append(whereSql);
		querySql.append(orderSql);
		// 拼凑完整的分页SQL
		querySql.insert(0, "select * from (select m.*, rownum num from (");
		querySql.append(") m where rownum <=?) where num >?");
		// 将分页语句中的行数“?”的值添加到paramList中
		paramList.add(currentPage * pageSize);
		paramList.add((currentPage - 1) * pageSize);
		// 查询显示的记录集将显示内容封装成JavaBean List集合
		List result = queryForJavaBeanList(querySql.toString(), javaBeanType,
				paramList);
		// 封装分页模型对象
		PageModel model = new PageModel();
		model.setAllCount(allCount);
		model.setCurrentPage(currentPage);
		model.setPageSize(pageSize);
		model.setResult(result);
		return model;
	}
	/**
	 * 查询多个JavaBean对象
	 * 
	 * @param sql
	 *            查询语句
	 * @param javaBeanClass
	 *            需要返回的Javabean对象类型
	 * @param params
	 *            语句中的"?"的参数值
	 * @return javaBean对象集合
	 */
	protected List queryForJavaBeanList(String sql, Class javaBeanClass,
			List params) {
		RowMapper rowMapper = new BeanPropertyRowMapper(javaBeanClass);
		if (params == null || params.size() == 0) {
			return jdbcTemplate.query(sql, rowMapper);
		} else {
			return jdbcTemplate.query(sql, rowMapper, params.toArray());
		}
	}
	/**
	 * 查询结果为1行1列。并且将该记录转换成int类型
	 * 
	 * @param sql
	 * @param params
	 * @return 返回查询结果，如果有异常返回-1
	 */
	protected int queryForInt(String sql, List params) {
		if (params == null || params.size() == 0) {
			return jdbcTemplate.queryForInt(sql);
		} else {
			return jdbcTemplate.queryForInt(sql, params.toArray());
		}
	}
	/**
	 * 查询一个JavaBean对象
	 * 
	 * @param sql
	 *            查询语句
	 * @param javaBeanClass
	 *            需要返回的Javabean对象类型
	 * @param params
	 *            语句中的"?"的参数值
	 * @return javaBean对象,如果数据库中不存在则返回null
	 */
	protected Object queryForJavaBean(String sql, Class javaBeanClass,
			List params) {
		RowMapper rowMapper = new BeanPropertyRowMapper(javaBeanClass);
		return jdbcTemplate.queryForObject(sql, rowMapper, params.toArray());
	}
}
