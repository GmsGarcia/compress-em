package net.gmsgarcia.compress.content;

/**
 * Which block class a {@link BlockSpec} instantiates.
 *
 * <p>1.17 expressed this implicitly: 20 classes extending {@code Block}, and
 * 15 blocks built from an inline {@code new FallingBlock(...)}. 1.21 turned
 * {@code FallingBlock} abstract, so the falling behaviour now needs a concrete
 * subclass.
 */
public enum BlockKind {
    /** Plain {@code Block}; the overwhelming majority. */
    SOLID,
    /** Falls when unsupported: compressed sand, red sand and gravel. */
    FALLING
}
