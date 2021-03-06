package org.dream.scheduled.tasks.converter;

import org.dream.scheduled.tasks.dto.CheckinParamsDto;
import org.dream.scheduled.tasks.form.CronJobScheduleInsertForm;
import org.dream.scheduled.tasks.form.CronJobScheduleUpdateForm;
import org.dream.scheduled.tasks.util.AESUtil;
import org.springframework.stereotype.Component;

@Component
public class CronJobScheduleToDtoConverter {

    // TODO: Fix this duplication
    public CheckinParamsDto convert(CronJobScheduleInsertForm cronJobScheduleForm) {
        CheckinParamsDto checkinParams = new CheckinParamsDto();
        checkinParams.setUsername(cronJobScheduleForm.getUsername());
        checkinParams.setCheckinTime(cronJobScheduleForm.getCheckinTime());
        checkinParams.setDescription(cronJobScheduleForm.getDescription());
        checkinParams.setOvertime(cronJobScheduleForm.getOvertime());
        checkinParams.setSecret(AESUtil.encrypt(cronJobScheduleForm.getSecret()));
        checkinParams.setMail(cronJobScheduleForm.getMail());
        return checkinParams;
    }
    
    public CheckinParamsDto convert(CronJobScheduleUpdateForm cronJobScheduleForm) {
        CheckinParamsDto checkinParams = new CheckinParamsDto();
        checkinParams.setUsername(cronJobScheduleForm.getUsername());
        checkinParams.setDescription(cronJobScheduleForm.getDescription());
        checkinParams.setOvertime(cronJobScheduleForm.getOvertime());
        checkinParams.setSecret(AESUtil.encrypt(cronJobScheduleForm.getSecret()));
        checkinParams.setMail(cronJobScheduleForm.getMail());
        return checkinParams;
    }
    
}
