package com.softxm.hs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Tcontract;
import com.softxm.hs.service.ContractService;

public class ContractAction extends BaseWebAction implements ModelDriven<Tcontract>{
	private Tcontract tcontract = new Tcontract();
	@Autowired
	private ContractService contractService;
	@Override
	public Tcontract getModel() {
		// TODO Auto-generated method stub
		return tcontract;
	}
	/**
	 * 合同列表
	 * @return
	 * @throws Exception
	 */
	public String contractList() throws Exception
	{
		pageModel=contractService.contractList(currentPage,pageSize,tcontract);
		return "contractList";
	}
	/**
	 * 添加新合同
	 */
	public String newContract() throws Exception
	{
		System.out.println(tcontract.getCmessage());
		contractService.newContract(tcontract);
		
		return success("添加合同成功 ", true, "oa29");
	}
	/**
	 * 查看合同
	 */
	public String getcontract() throws Exception
	{
		tcontract=contractService.getcontract(tcontract.getCid());
		return "getcontract";
	}
	/**
	 * 查看个人合同
	 */
	public String getPersonContract() throws Exception
	{
		tcontract=contractService.getcontractByUiid(findLoginUser().getUiid());
		return "getPersonContract";
	}
	/**
	 * 删除合同
	 * @return
	 * @throws Exception
	 */
	public String delcontract()throws Exception
	{
		contractService.delcontract(tcontract.getCid());
		return success("删除成功", false, "oa29");
	}
}
