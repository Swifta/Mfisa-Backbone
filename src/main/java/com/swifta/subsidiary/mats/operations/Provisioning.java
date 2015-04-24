package com.swifta.subsidiary.mats.operations;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.swifta.sub.mats.serviceinterface.ServiceCommission;
import com.swifta.sub.mats.serviceinterface.ServiceFeeConditionTypes;
import com.swifta.sub.mats.serviceinterface.ServiceFeeModelTypes;
import com.swifta.sub.mats.serviceinterface.ServiceFees;
import com.swifta.subsidiary.mats.operations.provisioning.model.Accountholderdetails;
import com.swifta.subsidiary.mats.operations.provisioning.model.Credentials;
import com.swifta.subsidiary.mats.operations.provisioning.model.Securityquestions;
import com.swifta.subsidiary.mats.operations.provisioning.response.Activationresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.AddProfileThresholdrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.AddProfilerequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Addaccountrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Addaccounttoexistinguserrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Addcustodyaccountrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Webauthenticationrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Changepasswordrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.EditProfilerequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Linkaccountrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.PasswordResetrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Registrationrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.RemoveProfilePermissionrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.RemoveProfilerequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Servicefeeandcomissionrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.SetDefaultaccountrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.SetProfilePermissionrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Setparentrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.Suspendaccountholderrequestresponse;
import com.swifta.subsidiary.mats.operations.provisioning.response.UnLinkaccountrequestresponse;

@WebService(serviceName = "provisioning", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0")
public interface Provisioning {

	@WebMethod(action = "webauthenticate")
	public Webauthenticationrequestresponse webauthenticate(
			@WebParam(name = "resourceid") String resourceid,
			@WebParam(name = "password") String password);

	@WebMethod(action = "addProfileThreshold")
	public AddProfileThresholdrequestresponse addProfileThreshold(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "profilename") String profilename,
			@WebParam(name = "action") Integer[] action,
			@WebParam(name = "profileid") int profileid,
			@WebParam(name = "thresholdtypeid") int thresholdtypeid,
			@WebParam(name = "profiletypeid") int profiletypeid);

	@WebMethod(action = "addProfile")
	public AddProfilerequestresponse addProfile(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "profilename") String profilename,
			@WebParam(name = "profiletypeid") int profiletypeid);

	@WebMethod(action = "editProfile")
	public EditProfilerequestresponse editProfile(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "profilename") String profilename,
			@WebParam(name = "oldprofilename") String oldprofilename,
			@WebParam(name = "profileid") int profileid);

	@WebMethod(action = "removeProfile")
	public RemoveProfilerequestresponse removeProfile(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "profilename") String profilename,
			@WebParam(name = "profileid") int profileid);

	@WebMethod(action = "setProfilePermission")
	public SetProfilePermissionrequestresponse setProfilePermission(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "profilename") String profilename,
			@WebParam(name = "profileid") int profileid,
			@WebParam(name = "operation") String[] permissionaction);

	@WebMethod(action = "removeProfilePermission")
	public RemoveProfilePermissionrequestresponse removeProfilePermission(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "profilename") String profilename,
			@WebParam(name = "profileid") int profileid,
			@WebParam(name = "operation") String[] permissionaction);

	@WebMethod(action = "activationrequest")
	public Activationresponse activationrequest(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "resourceid") String resourceid,
			@WebParam(name = "credential") Credentials credential,
			@WebParam(name = "securityquestionanswer") String securityquestionanswer,
			@WebParam(name = "identificationno") String identificationno,
			@WebParam(name = "bankdomainid") String bankdomain,
			@WebParam(name = "currency") String currency);

	@WebMethod(action = "setdefaultaccount")
	public SetDefaultaccountrequestresponse setdefaultaccount(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "initiatinguserresourceid") String initiatinguserresourceid,
			@WebParam(name = "childuserresourceid") String childuserresourceid,
			@WebParam(name = "paraentaccountresourceid") String parentaccountresourceid);

	@WebMethod(action = "linkaccount")
	public Linkaccountrequestresponse linkaccount(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "initiatinguserresourceid") String initiatinguserresourceid,
			@WebParam(name = "childuserresourceid") String childuserresourceid,
			@WebParam(name = "profileid") int profileid,
			@WebParam(name = "paraentaccountresourceid") String parentaccountresourceid);

	@WebMethod(action = "unlinkaccount")
	public UnLinkaccountrequestresponse unlinkaccount(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "initiatinguserresourceid") String initiatinguserresourceid,
			@WebParam(name = "childuserresourceid") String childuserresourceid,
			@WebParam(name = "profileid") int profileid,
			@WebParam(name = "paraentaccountresourceid") String parentaccountresourceid);

	@WebMethod(action = "registration")
	public Registrationrequestresponse registration(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "username") String username,
			@WebParam(name = "msisdn") String msisdn,
			@WebParam(name = "email") String email,
			@WebParam(name = "profileid") int profileid,
			@WebParam(name = "bankcodeid") int bankcodeid,
			@WebParam(name = "bankaccount") String bankaccount,
			@WebParam(name = "clearingnumber") String clearingnumber,
			@WebParam(name = "accountholderdetails") Accountholderdetails accountholderdetails,
			@WebParam(name = "currencyid") String currencyid,
			@WebParam(name = "bankdomainnameid") String bankdomainnameid,
			@WebParam(name = "termscondition") String termscondition,
			@WebParam(name = "securityquestions") List<Securityquestions> securityquestions);

	@WebMethod(action = "setupservicefeesandcommission")
	public Servicefeeandcomissionrequestresponse setupservicefeesandcommission(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "userresourceid") String userresourceid,
			@WebParam(name = "servicefeecondition") ServiceFeeConditionTypes servicefeecondition,
			@WebParam(name = "servicefeemodel") ServiceFeeModelTypes servicefeemodel,
			@WebParam(name = "servicefeedetails") List<ServiceFees> servicefeedetails,
			@WebParam(name = "servicecommissiondetails") List<ServiceCommission> servicecommissiondetails);

	@WebMethod(action = "changepassword")
	public Changepasswordrequestresponse changepassword(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "username") String username,
			@WebParam(name = "newcredentials") String newcredentials,
			@WebParam(name = "oldcredentials") String oldcredentials);

	@WebMethod(action = "passwordReset")
	public PasswordResetrequestresponse passwordReset(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "username") String username,
			@WebParam(name = "confirmnewpassword") String confirmnewpassword);

	/* future services */

	@WebMethod(action = "addcustodyaccount")
	public Addcustodyaccountrequestresponse addcustodyaccount(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "currencycode") String currencycode,
			@WebParam(name = "bankcode") String bankcode,
			@WebParam(name = "accountnumber") String accountnumber,
			@WebParam(name = "accountname") String accountname,
			@WebParam(name = "bankdomain") String bankdomain);

	@WebMethod(action = "addaccount")
	public Addaccountrequestresponse addaccount(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "accounttype") String accounttype,
			@WebParam(name = "accountprofileid") String accountprofileid,
			@WebParam(name = "accountreferenceprofile") String accountreferenceprofile);

	@WebMethod(action = "addaccounttoexistinguser")
	public Addaccounttoexistinguserrequestresponse addaccounttoexistinguser(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "resourceid") String resourceid,
			@WebParam(name = "accounttype") String accounttype,
			@WebParam(name = "profileid") String profileid,
			@WebParam(name = "currency") String currency);

	@WebMethod(action = "setparentaccount")
	public Setparentrequestresponse setparentaccount(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "userresourceid") String userresourceid,
			@WebParam(name = "paraentaccountresourceid") String parentuserresourceid,
			@WebParam(name = "reason") String reason);

	@WebMethod(action = "suspendaccountholder")
	public Suspendaccountholderrequestresponse suspendaccountholder(
			@WebParam(name = "loggedinUser") String loggedinUser,
			@WebParam(name = "resourceid") String resourceid,
			@WebParam(name = "confirmcredential") String confirmcredential);
}
