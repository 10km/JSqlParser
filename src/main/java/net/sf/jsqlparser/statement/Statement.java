/*
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2013 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.statement;

/**
 * An operation on the db (SELECT, UPDATE ecc.)
 */
public interface Statement {

    void accept(StatementVisitor statementVisitor);
}
