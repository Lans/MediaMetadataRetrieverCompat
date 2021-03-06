package in.xiandan.mmrc.retriever;

import in.xiandan.mmrc.IMediaMetadataRetriever;
import in.xiandan.mmrc.MediaMetadataRetrieverFactory;
import in.xiandan.mmrc.fileformat.FileFormat;

/**
 * @author dengyuhan
 * created 2019-06-24 17:03
 */
public class AndroidMediaMetadataRetrieverFactory implements MediaMetadataRetrieverFactory {

    @Override
    public boolean supportsFileFormat(FileFormat format) {
        return FileFormat.UNKNOWN == format;
    }


    @Override
    public IMediaMetadataRetriever create() {
        return new AndroidMediaMetadataRetriever();
    }
}
