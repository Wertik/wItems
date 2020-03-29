package space.devport.wertik.items.objects;

import lombok.Data;

@Data
public class Attribute {

    // System name of the attribute
    private final String name;

    // Reward, fired when used
    private Reward reward;

    // Cooldown on this attribute
    private Long cooldown;

    // How many times items can be used until consumed
    private int useLimit;

    public boolean hasCooldown() {
        return cooldown != 0;
    }
}