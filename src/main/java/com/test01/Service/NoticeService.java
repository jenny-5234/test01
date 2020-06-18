package com.test01.Service;

import com.test01.Dto.NoticeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoticeService {
    public List<NoticeDto> getNoticeList();
}
