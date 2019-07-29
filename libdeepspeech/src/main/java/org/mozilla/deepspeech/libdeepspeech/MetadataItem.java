/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.mozilla.deepspeech.libdeepspeech;

public class MetadataItem {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MetadataItem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MetadataItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public void setCharacter(String value) {
    implJNI.MetadataItem_character_set(swigCPtr, this, value);
  }

  public String getCharacter() {
    return implJNI.MetadataItem_character_get(swigCPtr, this);
  }

  public void setTimestep(int value) {
    implJNI.MetadataItem_timestep_set(swigCPtr, this, value);
  }

  public int getTimestep() {
    return implJNI.MetadataItem_timestep_get(swigCPtr, this);
  }

  public void setStart_time(float value) {
    implJNI.MetadataItem_start_time_set(swigCPtr, this, value);
  }

  public float getStart_time() {
    return implJNI.MetadataItem_start_time_get(swigCPtr, this);
  }

}
