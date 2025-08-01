package c0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    public static abstract class a extends Binder implements a {
        private static final String DESCRIPTOR = "io.github.libxposed.service.IXposedScopeCallback";
        public static final int TRANSACTION_onScopeRequestApproved = 3;
        public static final int TRANSACTION_onScopeRequestDenied = 4;
        public static final int TRANSACTION_onScopeRequestFailed = 6;
        public static final int TRANSACTION_onScopeRequestPrompted = 2;
        public static final int TRANSACTION_onScopeRequestTimeout = 5;

        public static class a implements a {
            public static a b;
            public IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new a(iBinder) : (a) queryLocalInterface;
        }

        public static a getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                a.b = aVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = DESCRIPTOR;
            if (i == 2) {
                parcel.enforceInterface(str);
                onScopeRequestPrompted(parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                onScopeRequestApproved(parcel.readString());
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(str);
                onScopeRequestDenied(parcel.readString());
                return true;
            } else if (i == 5) {
                parcel.enforceInterface(str);
                onScopeRequestTimeout(parcel.readString());
                return true;
            } else if (i == 6) {
                parcel.enforceInterface(str);
                onScopeRequestFailed(parcel.readString(), parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    void onScopeRequestApproved(String str);

    void onScopeRequestDenied(String str);

    void onScopeRequestFailed(String str, String str2);

    void onScopeRequestPrompted(String str);

    void onScopeRequestTimeout(String str);
}
