package br.com.jads.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);

}
