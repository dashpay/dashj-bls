/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dashj.bls;

public class G1ElementVector extends java.util.AbstractList<G1Element> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected G1ElementVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(G1ElementVector obj) {
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
        DASHJBLSJNI.delete_G1ElementVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public G1ElementVector(G1Element[] initialElements) {
    this();
    reserve(initialElements.length);

    for (G1Element element : initialElements) {
      add(element);
    }
  }

  public G1ElementVector(Iterable<G1Element> initialElements) {
    this();
    for (G1Element element : initialElements) {
      add(element);
    }
  }

  public G1Element get(int index) {
    return doGet(index);
  }

  public G1Element set(int index, G1Element e) {
    return doSet(index, e);
  }

  public boolean add(G1Element e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, G1Element e) {
    modCount++;
    doAdd(index, e);
  }

  public G1Element remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public G1ElementVector() {
    this(DASHJBLSJNI.new_G1ElementVector__SWIG_0(), true);
  }

  public G1ElementVector(G1ElementVector other) {
    this(DASHJBLSJNI.new_G1ElementVector__SWIG_1(G1ElementVector.getCPtr(other), other), true);
  }

  public int capacity() {
    return DASHJBLSJNI.G1ElementVector_capacity(swigCPtr, this);
  }

  public void reserve(int n) {
    DASHJBLSJNI.G1ElementVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return DASHJBLSJNI.G1ElementVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    DASHJBLSJNI.G1ElementVector_clear(swigCPtr, this);
  }

  public G1ElementVector(int count, G1Element value) {
    this(DASHJBLSJNI.new_G1ElementVector__SWIG_2(count, G1Element.getCPtr(value), value), true);
  }

  private int doSize() {
    return DASHJBLSJNI.G1ElementVector_doSize(swigCPtr, this);
  }

  private void doAdd(G1Element x) {
    DASHJBLSJNI.G1ElementVector_doAdd__SWIG_0(swigCPtr, this, G1Element.getCPtr(x), x);
  }

  private void doAdd(int index, G1Element x) {
    DASHJBLSJNI.G1ElementVector_doAdd__SWIG_1(swigCPtr, this, index, G1Element.getCPtr(x), x);
  }

  private G1Element doRemove(int index) {
    return new G1Element(DASHJBLSJNI.G1ElementVector_doRemove(swigCPtr, this, index), true);
  }

  private G1Element doGet(int index) {
    return new G1Element(DASHJBLSJNI.G1ElementVector_doGet(swigCPtr, this, index), false);
  }

  private G1Element doSet(int index, G1Element val) {
    return new G1Element(DASHJBLSJNI.G1ElementVector_doSet(swigCPtr, this, index, G1Element.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    DASHJBLSJNI.G1ElementVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
