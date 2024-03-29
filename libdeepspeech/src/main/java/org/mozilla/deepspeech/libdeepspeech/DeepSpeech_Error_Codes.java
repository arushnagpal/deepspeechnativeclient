/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.mozilla.deepspeech.libdeepspeech;

public final class DeepSpeech_Error_Codes {
  public final static DeepSpeech_Error_Codes ERR_OK = new DeepSpeech_Error_Codes("ERR_OK", implJNI.ERR_OK_get());
  public final static DeepSpeech_Error_Codes ERR_NO_MODEL = new DeepSpeech_Error_Codes("ERR_NO_MODEL", implJNI.ERR_NO_MODEL_get());
  public final static DeepSpeech_Error_Codes ERR_INVALID_ALPHABET = new DeepSpeech_Error_Codes("ERR_INVALID_ALPHABET", implJNI.ERR_INVALID_ALPHABET_get());
  public final static DeepSpeech_Error_Codes ERR_INVALID_SHAPE = new DeepSpeech_Error_Codes("ERR_INVALID_SHAPE", implJNI.ERR_INVALID_SHAPE_get());
  public final static DeepSpeech_Error_Codes ERR_INVALID_LM = new DeepSpeech_Error_Codes("ERR_INVALID_LM", implJNI.ERR_INVALID_LM_get());
  public final static DeepSpeech_Error_Codes ERR_MODEL_INCOMPATIBLE = new DeepSpeech_Error_Codes("ERR_MODEL_INCOMPATIBLE", implJNI.ERR_MODEL_INCOMPATIBLE_get());
  public final static DeepSpeech_Error_Codes ERR_FAIL_INIT_MMAP = new DeepSpeech_Error_Codes("ERR_FAIL_INIT_MMAP", implJNI.ERR_FAIL_INIT_MMAP_get());
  public final static DeepSpeech_Error_Codes ERR_FAIL_INIT_SESS = new DeepSpeech_Error_Codes("ERR_FAIL_INIT_SESS", implJNI.ERR_FAIL_INIT_SESS_get());
  public final static DeepSpeech_Error_Codes ERR_FAIL_INTERPRETER = new DeepSpeech_Error_Codes("ERR_FAIL_INTERPRETER", implJNI.ERR_FAIL_INTERPRETER_get());
  public final static DeepSpeech_Error_Codes ERR_FAIL_RUN_SESS = new DeepSpeech_Error_Codes("ERR_FAIL_RUN_SESS", implJNI.ERR_FAIL_RUN_SESS_get());
  public final static DeepSpeech_Error_Codes ERR_FAIL_CREATE_STREAM = new DeepSpeech_Error_Codes("ERR_FAIL_CREATE_STREAM", implJNI.ERR_FAIL_CREATE_STREAM_get());
  public final static DeepSpeech_Error_Codes ERR_FAIL_READ_PROTOBUF = new DeepSpeech_Error_Codes("ERR_FAIL_READ_PROTOBUF", implJNI.ERR_FAIL_READ_PROTOBUF_get());
  public final static DeepSpeech_Error_Codes ERR_FAIL_CREATE_SESS = new DeepSpeech_Error_Codes("ERR_FAIL_CREATE_SESS", implJNI.ERR_FAIL_CREATE_SESS_get());
  public final static DeepSpeech_Error_Codes ERR_FAIL_CREATE_MODEL = new DeepSpeech_Error_Codes("ERR_FAIL_CREATE_MODEL", implJNI.ERR_FAIL_CREATE_MODEL_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static DeepSpeech_Error_Codes swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + DeepSpeech_Error_Codes.class + " with value " + swigValue);
  }

  private DeepSpeech_Error_Codes(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private DeepSpeech_Error_Codes(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private DeepSpeech_Error_Codes(String swigName, DeepSpeech_Error_Codes swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static DeepSpeech_Error_Codes[] swigValues = { ERR_OK, ERR_NO_MODEL, ERR_INVALID_ALPHABET, ERR_INVALID_SHAPE, ERR_INVALID_LM, ERR_MODEL_INCOMPATIBLE, ERR_FAIL_INIT_MMAP, ERR_FAIL_INIT_SESS, ERR_FAIL_INTERPRETER, ERR_FAIL_RUN_SESS, ERR_FAIL_CREATE_STREAM, ERR_FAIL_READ_PROTOBUF, ERR_FAIL_CREATE_SESS, ERR_FAIL_CREATE_MODEL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

