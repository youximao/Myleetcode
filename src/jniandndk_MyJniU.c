#include<jni.h>
#include<stdio.h>
#include"jniandndk_MyJniU.h"

JNIEXPORT void JNICALL Java_jniandndk_MyJniU_show(JNIEnv *env, jclass jcl){
  printf("zheshic++");
  return;
  }
