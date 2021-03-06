/*Copyright 2019 ITESM MTY

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.edgardo.corasensor

import android.app.Application
import android.bluetooth.BluetoothDevice
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_settings.*
import java.util.*

class HeartAssistantApplication : Application() {

    private val _tag = "ApplicationHeart"

    var device: BluetoothDevice? = null
    var uuidConnection : UUID? = null

}