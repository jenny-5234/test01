package com.test01.Service;

import java.util.List;

import com.test01.Dao.NoticeDao;
import com.test01.Dto.NoticeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    NoticeDao noticeDao;

    @Override
    public List<NoticeDto> getNoticeList() {
        List<NoticeDto> list = noticeDao.getNoticeList();
        return list;
    }

}
