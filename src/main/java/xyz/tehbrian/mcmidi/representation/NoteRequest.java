package xyz.tehbrian.mcmidi.representation;

/**
 * Represents a request for a note to be played by some player.
 */
public final class NoteRequest {

    public final String playerName;
    public final Note note;

    public NoteRequest(final String playerName, final Note note) {
        this.playerName = playerName;
        this.note = note;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public Note getNote() {
        return this.note;
    }
}
