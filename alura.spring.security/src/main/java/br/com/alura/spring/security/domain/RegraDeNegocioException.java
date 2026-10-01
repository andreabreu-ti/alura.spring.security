package br.com.alura.spring.security.domain;

public class RegraDeNegocioException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RegraDeNegocioException(String message) {
        super(message);
    }

}
