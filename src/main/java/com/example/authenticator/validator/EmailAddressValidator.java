package com.example.authenticator.validator;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public interface EmailAddressValidator {

	public boolean isValidEmailAddress(String emailAddress);
}
