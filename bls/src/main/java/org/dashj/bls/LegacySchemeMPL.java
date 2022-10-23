/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dashj.bls;

public class LegacySchemeMPL extends CoreMPL {
  private transient long swigCPtr;

  protected LegacySchemeMPL(long cPtr, boolean cMemoryOwn) {
    super(DASHJBLSJNI.LegacySchemeMPL_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LegacySchemeMPL obj) {
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
        DASHJBLSJNI.delete_LegacySchemeMPL(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LegacySchemeMPL() {
    this(DASHJBLSJNI.new_LegacySchemeMPL(), true);
  }

  public byte[] skToPk(PrivateKey seckey) { return DASHJBLSJNI.LegacySchemeMPL_skToPk(swigCPtr, this, PrivateKey.getCPtr(seckey), seckey); }

  public G2Element sign(PrivateKey seckey, byte[] message) {
    return new G2Element(DASHJBLSJNI.LegacySchemeMPL_sign(swigCPtr, this, PrivateKey.getCPtr(seckey), seckey, message), true);
  }

  public boolean verify(byte[] pubkey, byte[] message, byte[] signature) {
    return DASHJBLSJNI.LegacySchemeMPL_verify(swigCPtr, this, pubkey, message, signature);
  }

  public byte[] aggregate(Uint8VectorVector signatures) { return DASHJBLSJNI.LegacySchemeMPL_aggregate(swigCPtr, this, Uint8VectorVector.getCPtr(signatures), signatures); }

  public G2Element aggregateSecure(G1ElementVector vecPublicKeys, G2ElementVector vecSignatures, byte[] message) {
    return new G2Element(DASHJBLSJNI.LegacySchemeMPL_aggregateSecure(swigCPtr, this, G1ElementVector.getCPtr(vecPublicKeys), vecPublicKeys, G2ElementVector.getCPtr(vecSignatures), vecSignatures, message), true);
  }

  public boolean verifySecure(G1ElementVector vecPublicKeys, G2Element signature, byte[] message) {
    return DASHJBLSJNI.LegacySchemeMPL_verifySecure(swigCPtr, this, G1ElementVector.getCPtr(vecPublicKeys), vecPublicKeys, G2Element.getCPtr(signature), signature, message);
  }

  public boolean aggregateVerify(Uint8VectorVector pubkeys, Uint8VectorVector messages, byte[] signature) {
    return DASHJBLSJNI.LegacySchemeMPL_aggregateVerify__SWIG_0(swigCPtr, this, Uint8VectorVector.getCPtr(pubkeys), pubkeys, Uint8VectorVector.getCPtr(messages), messages, signature);
  }

  public boolean aggregateVerify(G1ElementVector pubkeys, Uint8VectorVector messages, G2Element signature) {
    return DASHJBLSJNI.LegacySchemeMPL_aggregateVerify__SWIG_1(swigCPtr, this, G1ElementVector.getCPtr(pubkeys), pubkeys, Uint8VectorVector.getCPtr(messages), messages, G2Element.getCPtr(signature), signature);
  }

}
