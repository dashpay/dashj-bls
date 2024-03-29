/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dashj.bls;

public class Uint8VectorVector extends java.util.AbstractList<Uint8Vector> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Uint8VectorVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Uint8VectorVector obj) {
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
        DASHJBLSJNI.delete_Uint8VectorVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Uint8VectorVector(Uint8Vector[] initialElements) {
    this();
    reserve(initialElements.length);

    for (Uint8Vector element : initialElements) {
      add(element);
    }
  }

  public Uint8VectorVector(Iterable<Uint8Vector> initialElements) {
    this();
    for (Uint8Vector element : initialElements) {
      add(element);
    }
  }

  public Uint8Vector get(int index) {
    return doGet(index);
  }

  public Uint8Vector set(int index, Uint8Vector e) {
    return doSet(index, e);
  }

  public boolean add(Uint8Vector e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Uint8Vector e) {
    modCount++;
    doAdd(index, e);
  }

  public Uint8Vector remove(int index) {
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

  public Uint8VectorVector() {
    this(DASHJBLSJNI.new_Uint8VectorVector__SWIG_0(), true);
  }

  public Uint8VectorVector(Uint8VectorVector other) {
    this(DASHJBLSJNI.new_Uint8VectorVector__SWIG_1(Uint8VectorVector.getCPtr(other), other), true);
  }

  public int capacity() {
    return DASHJBLSJNI.Uint8VectorVector_capacity(swigCPtr, this);
  }

  public void reserve(int n) {
    DASHJBLSJNI.Uint8VectorVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return DASHJBLSJNI.Uint8VectorVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    DASHJBLSJNI.Uint8VectorVector_clear(swigCPtr, this);
  }

  public Uint8VectorVector(int count, Uint8Vector value) {
    this(DASHJBLSJNI.new_Uint8VectorVector__SWIG_2(count, Uint8Vector.getCPtr(value), value), true);
  }

  private int doSize() {
    return DASHJBLSJNI.Uint8VectorVector_doSize(swigCPtr, this);
  }

  private void doAdd(Uint8Vector x) {
    DASHJBLSJNI.Uint8VectorVector_doAdd__SWIG_0(swigCPtr, this, Uint8Vector.getCPtr(x), x);
  }

  private void doAdd(int index, Uint8Vector x) {
    DASHJBLSJNI.Uint8VectorVector_doAdd__SWIG_1(swigCPtr, this, index, Uint8Vector.getCPtr(x), x);
  }

  private Uint8Vector doRemove(int index) {
    return new Uint8Vector(DASHJBLSJNI.Uint8VectorVector_doRemove(swigCPtr, this, index), true);
  }

  private Uint8Vector doGet(int index) {
    return new Uint8Vector(DASHJBLSJNI.Uint8VectorVector_doGet(swigCPtr, this, index), false);
  }

  private Uint8Vector doSet(int index, Uint8Vector val) {
    return new Uint8Vector(DASHJBLSJNI.Uint8VectorVector_doSet(swigCPtr, this, index, Uint8Vector.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    DASHJBLSJNI.Uint8VectorVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
