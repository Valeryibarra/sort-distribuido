/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServerInterfaceClassGenerator
 * on: Sat Apr 14 16:51:37 COT 2018
 */

package interfaces;


public class IDistributeFcInItf
extends org.ow2.frascati.tinfi.TinfiComponentInterface<interfaces.IDistribute>
implements interfaces.IDistribute {

  public IDistributeFcInItf()  {
  }

  public IDistributeFcInItf(org.objectweb.fractal.api.Component component,String s,org.objectweb.fractal.api.Type type,boolean flag,Object obj)  {
    super(component,s,type,flag,obj);
  }

  public java.util.ArrayList<java.lang.Character> distribute(final java.util.ArrayList<java.lang.Character> arg0)  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    java.util.ArrayList<java.lang.Character> ret = impl.distribute(arg0);
    return ret;
  }

}
