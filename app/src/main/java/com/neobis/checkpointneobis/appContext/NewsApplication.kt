package com.neobis.checkpointneobis.appContext

import android.app.Application

//этот класс нужен для получение контекта для ViewModel так как она не должна знать об активити
class NewsApplication: Application()