package br.com.alura.spring.security.domain.consulta;

import java.time.LocalDateTime;

import br.com.alura.spring.security.domain.medico.Especialidade;

public record DadosListagemConsulta(Long id, String medico, String paciente, LocalDateTime data, Especialidade especialidade) {

    public DadosListagemConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getNome(), consulta.getPaciente(), consulta.getData(), consulta.getMedico().getEspecialidade());
    }

}