package edu.ifce.sgaa.infra.util;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public final class GeradorID {
    private static final AtomicLong CONTADOR = new AtomicLong(0);
    private static final String PREFIXO = "ID-";

    private GeradorID() {

    }

    public static String novoUUID() {
        return UUID.randomUUID().toString();
    }

    public static String novoIDCurto() {
        return UUID.randomUUID().toString()
                .replace("-", "")
                .substring(0, 8);
    }

    public static String novoIDSequencial() {
        return PREFIXO + CONTADOR.incrementAndGet();
    }

    public static String novoIDMisturado() {
        return String.format("%d-%04d",
                System.currentTimeMillis(),
                (int) (Math.random() * 10000));
    }
}