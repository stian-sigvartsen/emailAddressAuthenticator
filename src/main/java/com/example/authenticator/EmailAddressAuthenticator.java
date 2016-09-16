package com.example.authenticator;

import java.util.Map;

import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.auth.Authenticator;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
	},
	service = Authenticator.class
)
public class EmailAddressAuthenticator implements Authenticator {

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress,
			String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap) throws AuthException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int authenticateByScreenName(long companyId, String screenName,
			String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap) throws AuthException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int authenticateByUserId(long companyId, long userId,
			String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap) throws AuthException {
		// TODO Auto-generated method stub
		return 0;
	}
}