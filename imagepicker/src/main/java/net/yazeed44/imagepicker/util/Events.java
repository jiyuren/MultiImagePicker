package net.yazeed44.imagepicker.util;

import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;

/**
 * Created by yazeed44 on 6/13/15.
 */
public final class Events {

    private Events() {

    }


    public static class OnClickAlbumEvent {
        public final AlbumEntry albumEntry;

        public OnClickAlbumEvent(final AlbumEntry albumEntry) {
            this.albumEntry = albumEntry;
        }
    }

    public static class OnPickImageEvent {
        public final ImageEntry imageEntry;

        public OnPickImageEvent(final ImageEntry imageEntry) {
            this.imageEntry = imageEntry;
        }
    }

    public static class OnUnpickImageEvent {
        public final ImageEntry imageEntry;

        public OnUnpickImageEvent(final ImageEntry imageEntry) {
            this.imageEntry = imageEntry;
        }
    }

    public static class OnAttachFabEvent {
        public final FloatingActionButton fab;

        public OnAttachFabEvent(FloatingActionButton fab) {
            this.fab = fab;
        }
    }

    public static class OnPublishPickOptionsEvent {
        public final Picker options;

        public OnPublishPickOptionsEvent(final Picker options) {
            this.options = options;
        }
    }

    public static class onAlbumsLoadedEvent {
        public final ArrayList<AlbumEntry> albumList;

        public onAlbumsLoadedEvent(final ArrayList<AlbumEntry> albumList) {
            this.albumList = albumList;
        }
    }

    public static class OnChangingDisplayedImageEvent {
        public final ImageEntry currentImage;

        public OnChangingDisplayedImageEvent(ImageEntry currentImage) {

            this.currentImage = currentImage;
        }
    }
}
