/*
 * Copyright (c) 2019, AngBoot Technology Corp, All Rights Reserved.
 *
 * The software and information contained herein are copyrighted and
 * proprietary to AngBoot Technology Corp. This software is furnished
 * pursuant to a written license agreement and may be used, copied,
 * transmitted, and stored only in accordance with the terms of such
 * license and with the inclusion of the above copyright notice. Please
 * refer to the file "COPYRIGHT" for further copyright and licensing
 * information. This software and information or any other copies
 * thereof may not be provided or otherwise made available to any other
 * person.
 */

package com.angboot.authority.dao;

import com.angboot.domain.Authorization;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AuthorizationDao {
   @Select("SELECT username, authority FROM t_authorities WHERE username=#{name}")
   public List<Authorization> getAuthenticationByName(String name);
}
