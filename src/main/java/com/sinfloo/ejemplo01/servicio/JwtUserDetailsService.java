package com.sinfloo.ejemplo01.servicio;
import com.sinfloo.ejemplo01.modelo.Usuario;
import com.sinfloo.ejemplo01.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	private UsuarioRepositorio userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = userDao.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(usuario.getUsuario(), usuario.getContrasena(),
				new ArrayList<>());
	}

	public Usuario save(Usuario user) {
		Usuario newUser = new Usuario();
		newUser.setUsuario(user.getUsuario());
		newUser.setContrasena(bcryptEncoder.encode(user.getContrasena()));
		return userDao.save(newUser);
	}
}