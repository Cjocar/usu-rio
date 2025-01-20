package business;

import business.Dto.UsuarioDTO;
import business.converter.UsuarioConverter;
import infrastructure.entity.Usuario;
import infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



    @Service
    @RequiredArgsConstructor
    public class UsuarioService {

        private final UsuarioRepository usuarioRepository;
        private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvausuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(
            usuarioRepository.save(usuario)
        );


    }
}
