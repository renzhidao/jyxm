package com.efs.sdk.base.core.util.b;

import com.efs.sdk.base.core.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a {
    private static final IvParameterSpec a = new IvParameterSpec(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0});

    private static SecretKeySpec a(String str) {
        return new SecretKeySpec(str.getBytes(), "AES");
    }

    public static byte[] a(String str, String str2) {
        try {
            return b(str.getBytes("UTF-8"), str2);
        } catch (Throwable e) {
            Log.e("efs.base", "getBytes error", e);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, String str) {
        Throwable e;
        try {
            Key a = a(str);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, a, a);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            Log.e("efs.base", "aes decrypt error", e);
            return null;
        } catch (NoSuchPaddingException e3) {
            e = e3;
            Log.e("efs.base", "aes decrypt error", e);
            return null;
        } catch (InvalidKeyException e4) {
            e = e4;
            Log.e("efs.base", "aes decrypt error", e);
            return null;
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            Log.e("efs.base", "aes decrypt error", e);
            return null;
        } catch (BadPaddingException e6) {
            e = e6;
            Log.e("efs.base", "aes decrypt error", e);
            return null;
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            Log.e("efs.base", "aes decrypt error", e);
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        Throwable e;
        try {
            Key a = a(str);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, a, a);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            Log.e("efs.base", "aes encrypt error", e);
            return null;
        } catch (NoSuchPaddingException e3) {
            e = e3;
            Log.e("efs.base", "aes encrypt error", e);
            return null;
        } catch (InvalidKeyException e4) {
            e = e4;
            Log.e("efs.base", "aes encrypt error", e);
            return null;
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            Log.e("efs.base", "aes encrypt error", e);
            return null;
        } catch (BadPaddingException e6) {
            e = e6;
            Log.e("efs.base", "aes encrypt error", e);
            return null;
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            Log.e("efs.base", "aes encrypt error", e);
            return null;
        }
    }
}
