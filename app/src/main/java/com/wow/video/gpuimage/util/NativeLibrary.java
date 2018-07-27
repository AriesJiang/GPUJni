package com.wow.video.gpuimage.util;

/**
 * Created by JiangYiDong on 2018/2/28.
 *
 * 包名如果变更，同步改动NativeLibrary的包名路径
 */

public class NativeLibrary {
    static {
        System.loadLibrary("gpuimage-lib");
    }

    public static native void YUVtoRBGA(byte[] yuv, int width, int height, int[] out);

    public static native void YUVtoARBG(byte[] yuv, int width, int height, int[] out);

    public static native void test();
}
