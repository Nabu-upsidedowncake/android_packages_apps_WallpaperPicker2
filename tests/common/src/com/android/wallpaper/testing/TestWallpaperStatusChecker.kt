/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.wallpaper.testing

import com.android.wallpaper.module.WallpaperStatusChecker

class TestWallpaperStatusChecker : WallpaperStatusChecker {
    private var _isHomeStaticWallpaperSet: Boolean = true
    private var _isLockWallpaperSet = true

    fun setHomeStaticWallpaperSet(isSet: Boolean) {
        _isHomeStaticWallpaperSet = isSet
    }

    fun setLockWallpaperSet(isSet: Boolean) {
        _isLockWallpaperSet = isSet
    }

    override fun isHomeStaticWallpaperSet(): Boolean {
        return _isHomeStaticWallpaperSet
    }

    override fun isLockWallpaperSet(): Boolean {
        return _isLockWallpaperSet
    }
}
