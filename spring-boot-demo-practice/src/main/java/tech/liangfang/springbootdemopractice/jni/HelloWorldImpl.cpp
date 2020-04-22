#include "jni.h"
#include "tech_liangfang_springbootdemopractice_jni_HelloWord.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_tech_liangfang_springbootdemopractice_jni_HelloWord_sayHelloWorld(JNIEnv *env,jobject obj){
    printf("Hello World!\n");
    return;
}