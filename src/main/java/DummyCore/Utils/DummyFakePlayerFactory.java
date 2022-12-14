package DummyCore.Utils;

import com.mojang.authlib.GameProfile;
import java.util.Hashtable;
import java.util.UUID;

public class DummyFakePlayerFactory {

    public static Hashtable<Class<?>, GameProfile> fakeProfiles = new Hashtable<Class<?>, GameProfile>();

    public static GameProfile getGameProfile(Class<?> mod) {
        if (fakeProfiles.get(mod) == null) {
            fakeProfiles.put(mod, new GameProfile(UUID.randomUUID(), "[DC][" + mod.getSimpleName() + "]"));
        }
        return fakeProfiles.get(mod);
    }
}
