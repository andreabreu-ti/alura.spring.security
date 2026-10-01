package br.com.alura.spring.security.domain.consulta;

import java.time.LocalDateTime;

import br.com.alura.spring.security.domain.medico.Especialidade;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

public record DadosAgendamentoConsulta(

        Long id,
        Long idMedico,

        @NotNull
        String paciente,

        @NotNull
        @Future
        LocalDateTime data,

        Especialidade especialidade) {
}