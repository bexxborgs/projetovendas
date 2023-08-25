package br.com.rborges.refletions.anotacao.cadastro.exception;

public class TipoChaveNaoEncontradaException extends Exception {
    public TipoChaveNaoEncontradaException (String msg){
        this (msg, null);
    }

    public TipoChaveNaoEncontradaException (String msg, Throwable e) {
        super(msg, e);
    }
}