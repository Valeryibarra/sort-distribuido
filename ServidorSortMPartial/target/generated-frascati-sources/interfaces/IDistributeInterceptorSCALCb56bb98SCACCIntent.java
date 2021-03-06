/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.InterceptorClassGenerator
 * on: Sat Apr 14 16:51:37 COT 2018
 */

package interfaces;


public class IDistributeInterceptorSCALCb56bb98SCACCIntent
extends org.ow2.frascati.tinfi.TinfiComponentInterceptor<interfaces.IDistribute>
implements interfaces.IDistribute,org.objectweb.fractal.julia.Interceptor {

  private juliac.generated.SCALifeCycleControllerImpl _lc;
  private static java.lang.reflect.Method[] METHODS;
  public IDistributeInterceptorSCALCb56bb98SCACCIntent()  {
  }

  private IDistributeInterceptorSCALCb56bb98SCACCIntent(Object obj)  {
    setFcItfDelegate(obj);
  }

  public void initFcController(org.objectweb.fractal.julia.InitializationContext ic) throws org.objectweb.fractal.api.factory.InstantiationException  {
    super.initFcController(ic);
    Object olc = ic.getInterface("lifecycle-controller");
    if ( !( olc instanceof juliac.generated.SCALifeCycleControllerImpl ) )
    {
      while ( olc instanceof org.objectweb.fractal.julia.Interceptor )
      {
        olc = ((org.objectweb.fractal.julia.Interceptor)olc).getFcItfDelegate();
      }

    }
    _lc = (juliac.generated.SCALifeCycleControllerImpl) olc;
    initIntentHandlersMap(METHODS);
  }

  public Object clone()  {
    IDistributeInterceptorSCALCb56bb98SCACCIntent clone = new IDistributeInterceptorSCALCb56bb98SCACCIntent(getFcItfDelegate());
    initFcClone(clone);
    clone._lc = _lc;
    clone.initIntentHandlersMap(METHODS);
    return clone;
  }

  public java.util.ArrayList<java.lang.Character> distribute(final java.util.ArrayList<java.lang.Character> arg0)  {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.incrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter++;
      }

    }

      try {
    interfaces.IDistribute impl = pushFcAndGet("IDistribute",interfaces.IDistribute.class,this);
    try {
    java.util.List<org.ow2.frascati.tinfi.api.IntentHandler> handlers = intentHandlersMap.get(METHODS[0]);
    try {
      if( handlers.size() == 0 ) {
        java.util.ArrayList<java.lang.Character> ret = impl.distribute(arg0);
        return ret;
      }
      else {
        org.objectweb.fractal.api.Component comp = getFcComponent();
        org.objectweb.fractal.api.Interface itf = getFcItf();
        org.ow2.frascati.tinfi.IntentJoinPointImpl<interfaces.IDistribute> ijp = new org.ow2.frascati.tinfi.IntentJoinPointImpl();
        ijp.init(handlers,comp,itf,impl,METHODS[0],(Object)arg0);
    java.util.ArrayList<java.lang.Character> ret = (java.util.ArrayList<java.lang.Character>) ijp.proceed();
    return ret;
      }
    }
    catch( Throwable t ) {
      if( t instanceof RuntimeException ) {
        throw (RuntimeException) t;
      }
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(t);
    }
    }
    finally {
      releaseFcAndPop(impl,false);
    }
      }
      finally {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.decrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter--;
      }

    }

      }
  }

  static  {
    try {
      METHODS = new java.lang.reflect.Method[]{
        interfaces.IDistribute.class.getMethod("distribute",java.util.ArrayList.class),
      };
    }
    catch( NoSuchMethodException e ) {
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(e);
    }
  }

}
