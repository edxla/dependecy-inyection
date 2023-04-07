/**
 * 
 */
package com.amazarahi.devs.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Amazarashi
 *
 */
@Service
//@Profile("dev")
@Profile({"dev","default"} )
public class DevEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		// TODO Auto-generated method stub
		return "Dev";
	}

}
