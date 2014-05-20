package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.EMailUser;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Temail;
import com.softxm.hs.model.Temailattach;

public interface EmailDao {

	List<EMailUser> queryAllDD();

	PageModel queryEMailUserModel(Object userid, EMailUser emailuser,
			int currentPage, int pageSize);

	void saveEMail(Temail temail);

	void saveEMailTemp(Temail temail);

	PageModel querySendEmail(Object userid, int currentPage, int pageSize);

	PageModel queryDraftEmail(Long uiid, int currentPage, int pageSize);

	PageModel queryGcEMail(Long uiid, int currentPage, int pageSize);

	PageModel queryReceieveEmail(Long uiid, int currentPage, int pageSize);

	Temail queryEMail(Long eid);

	void delEmail(Long umid);

	void saveDEMail(Temail temail);

	void delAttcha(Long eaid);

	Temailattach getEMaileAttachById(Long eaid);

	void relEmail(long parseLong);

	void delFakeEmail(long parseLong);

	void changeRead(Long umid);

	void FWEMail(Temail temail);

}
