package xyz.tehbrian.mcmidi.representation;

import org.bukkit.Sound;

/**
 * Represents all Minecraft sounds which sound good when
 * played as an instrument.
 */
public enum Instrument {
    BANJO(Sound.BLOCK_NOTE_BLOCK_BANJO),
    BASEDRUM(Sound.BLOCK_NOTE_BLOCK_BASEDRUM),
    BASS(Sound.BLOCK_NOTE_BLOCK_BASS),
    BELL(Sound.BLOCK_NOTE_BLOCK_BELL),
    BIT(Sound.BLOCK_NOTE_BLOCK_BIT),
    CHIME(Sound.BLOCK_NOTE_BLOCK_CHIME),
    COW_BELL(Sound.BLOCK_NOTE_BLOCK_COW_BELL),
    DIDGERIDOO(Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO),
    FLUTE(Sound.BLOCK_NOTE_BLOCK_FLUTE),
    GUITAR(Sound.BLOCK_NOTE_BLOCK_GUITAR),
    HARP(Sound.BLOCK_NOTE_BLOCK_HARP),
    HAT(Sound.BLOCK_NOTE_BLOCK_HAT),
    IRON_XYLOPHONE(Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE),
    PLING(Sound.BLOCK_NOTE_BLOCK_PLING),
    SNARE(Sound.BLOCK_NOTE_BLOCK_SNARE),
    XYLOPHONE(Sound.BLOCK_NOTE_BLOCK_XYLOPHONE);

    private final Sound sound;

    Instrument(final Sound sound) {
        this.sound = sound;
    }

    public Sound asSound() {
        return this.sound;
    }
}
