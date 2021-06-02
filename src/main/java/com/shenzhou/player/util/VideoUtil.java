package com.shenzhou.player.util;

import com.shenzhou.player.entity.Video;
import org.springframework.web.multipart.MultipartFile;
import ws.schild.jave.EncoderException;
import ws.schild.jave.MultimediaInfo;
import ws.schild.jave.MultimediaObject;
import ws.schild.jave.VideoSize;

import java.io.File;

/**
 * 视频工具
 *
 * @author Mr.Cao
 **/
public class VideoUtil {

    /**
     * 获取视频信息
     *
     * @param path
     * @throws EncoderException
     */
    public static void getInfo(String path,Video video) throws EncoderException {
        MultimediaObject multimediaObject = new MultimediaObject(new File(path));
        MultimediaInfo info = multimediaObject.getInfo();
        VideoSize size = info.getVideo().getSize();
        video.setResolution(size.getWidth() + "×" + size.getHeight());
        video.setDuration(info.getDuration());
    }
}
