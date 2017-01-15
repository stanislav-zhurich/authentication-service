package com.stan.authentication.service

import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service


@Service
class OAuthUserDetaulService implements UserDetailsService {
	
	def users = ['stan':'pass', 'yan':'pass']

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		new User(username, 'pass', [new SimpleGrantedAuthority('USER')])
	}

}
