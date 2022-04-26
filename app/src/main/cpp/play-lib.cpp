#include <game-activity/GameActivity.cpp>
#include <game-text-input/gametextinput.cpp>

extern "C" {
#include <EGL/egl.h>
#include <GLES2/gl2.h>
#include <jni.h>
#include <cerrno>
#include <android/sensor.h>
#include <android/log.h>
#include <unistd.h>
#include <cstdlib>
}

#define DEBUG_TAG "NDKTest:Native"
#define LOGI(...) ((void)__android_log_print(ANDROID_LOG_INFO, DEBUG_TAG, __VA_ARGS__))

extern "C" {
void android_main(struct android_app *app);
};

/*
    android_main (not main) is our game entry function, it is called from
    the native app glue utility code as part of the onCreate handler.
*/

void android_main(struct android_app *app) {
    int i = 0;
    while(1) {
        LOGI("NDK test");
    }
}

