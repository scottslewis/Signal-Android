package org.signal.core.util.logging;

/**
 * A logger that does nothing.
 */
class NoopLogger extends Log.Logger {
  @Override
  public void v(String tag, String message, Throwable t) { }

  @Override
  public void d(String tag, String message, Throwable t) { }

  @Override
  public void i(String tag, String message, Throwable t) { }

  @Override
  public void w(String tag, String message, Throwable t) { }

  @Override
  public void e(String tag, String message, Throwable t) { }

  @Override
  public void wtf(String tag, String message, Throwable t) { }

  @Override
  public void flush() { }
}
