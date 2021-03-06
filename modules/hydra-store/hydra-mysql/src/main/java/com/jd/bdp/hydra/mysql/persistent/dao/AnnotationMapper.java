/*
 * Copyright jd
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.jd.bdp.hydra.mysql.persistent.dao;

import com.jd.bdp.hydra.AnnotationWeb;
import com.jd.bdp.hydra.Span;
import com.jd.bdp.hydra.mysql.persistent.entity.Absannotation;
import com.jd.bdp.hydra.mysql.persistent.entity.BusLog;

import java.util.List;

/**
 * User: biandi
 * Date: 13-5-8
 * Time: 下午3:29
 */
public interface AnnotationMapper {

    void addBuslogBatch(List<BusLog> busLogList);

    void addBuslog(BusLog busLog);

    void addAnnotation(Absannotation absannotation);

    void addAnnotationBatch(List<Absannotation> absannotationList);

    List<Absannotation> getAnnotations(List<Span> list);

    void addAnnotationWeb(AnnotationWeb annotationWeb);

    void addAnnotationWebBatch(List<AnnotationWeb> annotationWebList);

    //测试用
    void deleteAllAnnotation();
}
