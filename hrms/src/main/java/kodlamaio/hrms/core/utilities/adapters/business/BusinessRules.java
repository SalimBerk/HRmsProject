package kodlamaio.hrms.core.utilities.adapters.business;

import kodlamaio.hrms.core.utilities.results.Result;

public class BusinessRules {
	public static Result run(Result logics[]) {
		for (var result : logics) {

			if (!result.isSuccess()) {
				return result;
			}

		}
		return null;

	}

}
