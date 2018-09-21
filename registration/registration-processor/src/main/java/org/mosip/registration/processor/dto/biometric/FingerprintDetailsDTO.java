package org.mosip.registration.processor.dto.biometric;

import org.mosip.registration.processor.dto.BaseDTO;

import lombok.Data;

/**
 * Finger print image and its details
 * @author M1047595
 *
 */
@Data
public class FingerprintDetailsDTO extends BaseDTO{
	private byte[] fingerPrint;
	private String fingerPrintName;
	private double qualityScore;
	private boolean isForceCaptured;
	private String fingerType;
}
