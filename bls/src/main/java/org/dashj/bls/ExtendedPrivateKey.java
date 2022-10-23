/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dashj.bls;

public class ExtendedPrivateKey {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ExtendedPrivateKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExtendedPrivateKey obj) {
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
        DASHJBLSJNI.delete_ExtendedPrivateKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static ExtendedPrivateKey fromSeed(byte[] bytes) {
    return new ExtendedPrivateKey(DASHJBLSJNI.ExtendedPrivateKey_fromSeed(bytes), true);
  }

  public static ExtendedPrivateKey fromBytes(byte[] bytes) {
    return new ExtendedPrivateKey(DASHJBLSJNI.ExtendedPrivateKey_fromBytes(bytes), true);
  }

  public ExtendedPrivateKey privateChild(long i, boolean fLegacy) {
    return new ExtendedPrivateKey(DASHJBLSJNI.ExtendedPrivateKey_privateChild__SWIG_0(swigCPtr, this, i, fLegacy), true);
  }

  public ExtendedPrivateKey privateChild(long i) {
    return new ExtendedPrivateKey(DASHJBLSJNI.ExtendedPrivateKey_privateChild__SWIG_1(swigCPtr, this, i), true);
  }

  public ExtendedPublicKey publicChild(long i) {
    return new ExtendedPublicKey(DASHJBLSJNI.ExtendedPrivateKey_publicChild(swigCPtr, this, i), true);
  }

  public long getVersion() {
    return DASHJBLSJNI.ExtendedPrivateKey_getVersion(swigCPtr, this);
  }

  public short getDepth() {
    return DASHJBLSJNI.ExtendedPrivateKey_getDepth(swigCPtr, this);
  }

  public long getParentFingerprint() {
    return DASHJBLSJNI.ExtendedPrivateKey_getParentFingerprint(swigCPtr, this);
  }

  public long getChildNumber() {
    return DASHJBLSJNI.ExtendedPrivateKey_getChildNumber(swigCPtr, this);
  }

  public ChainCode getChainCode() {
    return new ChainCode(DASHJBLSJNI.ExtendedPrivateKey_getChainCode(swigCPtr, this), true);
  }

  public PrivateKey getPrivateKey() {
    return new PrivateKey(DASHJBLSJNI.ExtendedPrivateKey_getPrivateKey(swigCPtr, this), true);
  }

  public G1Element getPublicKey() {
    return new G1Element(DASHJBLSJNI.ExtendedPrivateKey_getPublicKey(swigCPtr, this), true);
  }

  public ExtendedPublicKey getExtendedPublicKey(boolean fLegacy) {
    return new ExtendedPublicKey(DASHJBLSJNI.ExtendedPrivateKey_getExtendedPublicKey__SWIG_0(swigCPtr, this, fLegacy), true);
  }

  public ExtendedPublicKey getExtendedPublicKey() {
    return new ExtendedPublicKey(DASHJBLSJNI.ExtendedPrivateKey_getExtendedPublicKey__SWIG_1(swigCPtr, this), true);
  }

  public void serialize(byte[] buffer) {
    DASHJBLSJNI.ExtendedPrivateKey_serialize__SWIG_0(swigCPtr, this, buffer);
  }

  public byte[] serialize() { return DASHJBLSJNI.ExtendedPrivateKey_serialize__SWIG_1(swigCPtr, this); }

  public ExtendedPrivateKey() {
    this(DASHJBLSJNI.new_ExtendedPrivateKey(), true);
  }

  public final static long SIZE = DASHJBLSJNI.ExtendedPrivateKey_SIZE_get();
}
