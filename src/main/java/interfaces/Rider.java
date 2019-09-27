package interfaces;

import interfaces.Rideable;

public interface Rider {
    void mount(Rideable ride);
    void dismount(Rideable ride);
    void ride(Rideable ride);
}
