package br.com.maddytec.cliente.service;

import br.com.maddytec.cliente.entity.Cliente;
import br.com.maddytec.cliente.http.controller.dto.filtro.ClienteFiltro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ClienteService {

    Cliente salvar(Cliente cliente);

    Page<Cliente> listaCliente(ClienteFiltro clienteFiltro, Pageable pageable);

    Optional<Cliente> buscarPorId(Long id);

    void removerPorId(Long id);
}
