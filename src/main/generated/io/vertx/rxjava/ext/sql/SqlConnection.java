/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.sql;

import java.util.Map;
import io.vertx.lang.rxjava.InternalHelper;
import rx.Observable;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.sql.UpdateResult;
import io.vertx.ext.sql.ResultSet;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * Represents a connection to a SQL database
 *
 * @author <a href="mailto:nscavell@redhat.com">Nick Scavelli</a>
 *
 * NOTE: This class has been automatically generated from the original non RX-ified interface using Vert.x codegen.
 */

public class SqlConnection {

  final io.vertx.ext.sql.SqlConnection delegate;

  public SqlConnection(io.vertx.ext.sql.SqlConnection delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Sets the auto commit flag for this connection. True by default.
   *
   * @param autoCommit  the autoCommit flag, true by default.
   * @param resultHandler  the handler which is called once this operation completes.
   * @see java.sql.Connection#setAutoCommit(boolean)
   */
  public SqlConnection setAutoCommit(boolean autoCommit, Handler<AsyncResult<Void>> resultHandler) {
    this.delegate.setAutoCommit(autoCommit, resultHandler);
    return this;
  }

  public Observable<Void> setAutoCommitObservable(boolean autoCommit) {
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    setAutoCommit(autoCommit, resultHandler.toHandler());
    return resultHandler;
  }

  /**
   * Executes the given SQL statement
   *
   * @param sql  the SQL to execute. For example <code>CREATE TABLE IF EXISTS table ...</code>
   * @param resultHandler  the handler which is called once this operation completes.
   * @see java.sql.Statement#execute(String)
   */
  public SqlConnection execute(String sql, Handler<AsyncResult<Void>> resultHandler) {
    this.delegate.execute(sql, resultHandler);
    return this;
  }

  public Observable<Void> executeObservable(String sql) {
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    execute(sql, resultHandler.toHandler());
    return resultHandler;
  }

  /**
   * Executes the given SQL <code>SELECT</code> statement which returns the results of the query.
   *
   * @param sql  the SQL to execute. For example <code>SELECT * FROM table ...</code>.
   * @param resultHandler  the handler which is called once the operation completes. It will return a ResultSet.
   *
   * @see java.sql.Statement#executeQuery(String)
   * @see java.sql.PreparedStatement#executeQuery(String)
   */
  public SqlConnection query(String sql, Handler<AsyncResult<ResultSet>> resultHandler) {
    this.delegate.query(sql, null /* Handler<AsyncResult<io.vertx.ext.sql.ResultSet>> with kind DATA_OBJECT not yet implemented */);
    return this;
  }

  public Observable<ResultSet> queryObservable(String sql) {
    io.vertx.rx.java.ObservableFuture<ResultSet> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    query(sql, resultHandler.toHandler());
    return resultHandler;
  }

  /**
   * Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.
   *
   * @param sql  the SQL to execute. For example <code>SELECT * FROM table ...</code>.
   * @param params  these are the parameters to fill the statement.
   * @param resultHandler  the handler which is called once the operation completes. It will return a ResultSet.
   *
   * @see java.sql.Statement#executeQuery(String)
   * @see java.sql.PreparedStatement#executeQuery(String)
   */
  public SqlConnection queryWithParams(String sql, JsonArray params, Handler<AsyncResult<ResultSet>> resultHandler) {
    this.delegate.queryWithParams(sql, params, null /* Handler<AsyncResult<io.vertx.ext.sql.ResultSet>> with kind DATA_OBJECT not yet implemented */);
    return this;
  }

  public Observable<ResultSet> queryWithParamsObservable(String sql, JsonArray params) {
    io.vertx.rx.java.ObservableFuture<ResultSet> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    queryWithParams(sql, params, resultHandler.toHandler());
    return resultHandler;
  }

  /**
   * Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
   * statement.
   *
   * @param sql  the SQL to execute. For example <code>INSERT INTO table ...</code>
   * @param resultHandler  the handler which is called once the operation completes.
   *
   * @see java.sql.Statement#executeUpdate(String)
   * @see java.sql.PreparedStatement#executeUpdate(String)
   */
  public SqlConnection update(String sql, Handler<AsyncResult<UpdateResult>> resultHandler) {
    this.delegate.update(sql, null /* Handler<AsyncResult<io.vertx.ext.sql.UpdateResult>> with kind DATA_OBJECT not yet implemented */);
    return this;
  }

  public Observable<UpdateResult> updateObservable(String sql) {
    io.vertx.rx.java.ObservableFuture<UpdateResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    update(sql, resultHandler.toHandler());
    return resultHandler;
  }

  /**
   * Executes the given prepared statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
   * statement with the given parameters
   *
   * @param sql  the SQL to execute. For example <code>INSERT INTO table ...</code>
   * @param params  these are the parameters to fill the statement.
   * @param resultHandler  the handler which is called once the operation completes.
   *
   * @see java.sql.Statement#executeUpdate(String)
   * @see java.sql.PreparedStatement#executeUpdate(String)
   */
  public SqlConnection updateWithParams(String sql, JsonArray params, Handler<AsyncResult<UpdateResult>> resultHandler) {
    this.delegate.updateWithParams(sql, params, null /* Handler<AsyncResult<io.vertx.ext.sql.UpdateResult>> with kind DATA_OBJECT not yet implemented */);
    return this;
  }

  public Observable<UpdateResult> updateWithParamsObservable(String sql, JsonArray params) {
    io.vertx.rx.java.ObservableFuture<UpdateResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    updateWithParams(sql, params, resultHandler.toHandler());
    return resultHandler;
  }

  /**
   * Closes the connection. Important to always close the connection when you are done so it's returned to the pool.
   *
   * @param handler the handler called when this operation completes.
   */
  public void close(Handler<AsyncResult<Void>> handler) {
    this.delegate.close(handler);
  }

  public Observable<Void> closeObservable() {
    io.vertx.rx.java.ObservableFuture<Void> handler = io.vertx.rx.java.RxHelper.observableFuture();
    close(handler.toHandler());
    return handler;
  }

  /**
   * Commits all changes made since the previous commit/rollback.
   *
   * @param handler the handler called when this operation completes.
   */
  public SqlConnection commit(Handler<AsyncResult<Void>> handler) {
    this.delegate.commit(handler);
    return this;
  }

  public Observable<Void> commitObservable() {
    io.vertx.rx.java.ObservableFuture<Void> handler = io.vertx.rx.java.RxHelper.observableFuture();
    commit(handler.toHandler());
    return handler;
  }

  /**
   * Rolls back all changes made since the previous commit/rollback.
   *
   * @param handler the handler called when this operation completes.
   */
  public SqlConnection rollback(Handler<AsyncResult<Void>> handler) {
    this.delegate.rollback(handler);
    return this;
  }

  public Observable<Void> rollbackObservable() {
    io.vertx.rx.java.ObservableFuture<Void> handler = io.vertx.rx.java.RxHelper.observableFuture();
    rollback(handler.toHandler());
    return handler;
  }


  public static SqlConnection newInstance(io.vertx.ext.sql.SqlConnection arg) {
    return new SqlConnection(arg);
  }
}
