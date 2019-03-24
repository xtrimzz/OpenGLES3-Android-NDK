package gles.cookbook.helloworldtriangle;

public class GLESNativeLib {

    static {
        System.loadLibrary("glNative");
    }

    public static native void init( String apkFilePath );
    public static native void resize(int width, int height );
    public static native void step();
}
