/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dashj.bls;

public class BasicSchemeMPL extends CoreMPL {
  private transient long swigCPtr;

  protected BasicSchemeMPL(long cPtr, boolean cMemoryOwn) {
    super(DASHJBLSJNI.BasicSchemeMPL_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BasicSchemeMPL obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DASHJBLSJNI.delete_BasicSchemeMPL(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static String getCIPHERSUITE_ID() {
    return DASHJBLSJNI.BasicSchemeMPL_CIPHERSUITE_ID_get();
  }

  public BasicSchemeMPL() {
    this(DASHJBLSJNI.new_BasicSchemeMPL(), true);
  }

  public boolean aggregateVerify(Uint8VectorVector pubkeys, Uint8VectorVector messages, byte[] signature) {
    return DASHJBLSJNI.BasicSchemeMPL_aggregateVerify__SWIG_0(swigCPtr, this, Uint8VectorVector.getCPtr(pubkeys), pubkeys, Uint8VectorVector.getCPtr(messages), messages, signature);
  }

  public boolean aggregateVerify(G1ElementVector pubkeys, Uint8VectorVector messages, G2Element signature) {
    return DASHJBLSJNI.BasicSchemeMPL_aggregateVerify__SWIG_1(swigCPtr, this, G1ElementVector.getCPtr(pubkeys), pubkeys, Uint8VectorVector.getCPtr(messages), messages, G2Element.getCPtr(signature), signature);
  }

}
