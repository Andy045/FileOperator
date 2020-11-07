package ando.file.compressor

import android.net.Uri

/**
 * Created on 2018/1/3 19:43
 *
 * @author andy
 *
 * A functional interface (callback) that returns true or false for the given input path should be compressed.
 */
interface ImageCompressPredicate {
    /**
     * Determine the given input path should be compressed and return a boolean.
     * @param uri input uri
     * @return the boolean result
     */
    fun apply(uri: Uri?): Boolean
}